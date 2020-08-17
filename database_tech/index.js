const express =require("express")
const app = express()
const bodyParser = require("body-parser")
const { connect, ObjectID } = require("mongodb")
const mongoClient = require("mongodb").MongoClient
let db
app.use(express.static(__dirname + '/public'))
mongoClient.connect("mongodb://localhost:27017", (err, client) => {
    if(err){
        return console.log(err)
    } 
    console.log("connected")
    db = client.db("hoaianh")
})
app.use(bodyParser.urlencoded({extended:true}))
app.set("view engine", "ejs")


app.get("/", function(req, res){
    let arr = db.collection("blog").find().toArray().then(arr =>{
        res.render("index.ejs",{
            arr:arr
        }).catch(error => {
            console.log(error)
        })
    })
})
app.post("/new_blogs", function(req, res){
    db.collection("blog").insertOne(req.body).then(results =>{}).catch(error => {
        console.log(error)
    })
    res.redirect("/")
})
app.get("/blog/:blogId", function(req, res){
    let id = req.params["blogId"]
    let objectId = require("mongodb").ObjectID
    db.collection("blog").findOne({_id: new objectId(id)}).then(result => {
        res.render("blog.ejs", {blog: result})
    }).catch(error => {
        console.error(error)
    })
})
app.post("/update_blog", function(req, res){
    let objectId = require("mongodb").ObjectID
    db.collection("blog").findOneAndUpdate(
        {_id: new objectId(req.body.blogId)},
        {$set: { title: req.body.blogTitle, image: req.body.blogImg}}
    ).then(result => {}).catch(error => {
        console.error(error)
    })
})
app.post("/delete_blog", function(req, res){
    let objectId = require("mongodb").ObjectID
    db.collection("blog").deleteOne(
        {_id: new objectId(req.body.blogId)},
    ).then(result => {}).catch(error => {
        console.error(error)
    })
})

app.listen(3000, function(){

})