const express = require("express")
const bodyParser = require("body-parser")
const app = express()
app.use(bodyParser.urlencoded({extended:true}))


app.set("view engine","ejs")

let object = [
    {   image: "https://specials-images.forbesimg.com/imageserve/5edebf2eb1784e0006de6f70/960x0.jpg?fit=scale", 
        title: "Harvard và USC nói với sinh viên quốc tế năm đầu hãy ở nhà vậy du học sinh học ở đâu bây giờ?",
        date: "26-07-2020"
    },
    {   image: "https://www.cv-library.co.uk/career-advice/wp-content/uploads/2018/06/What-is-it-like-working-in-IT.jpg", 
        title: "Kinh Nghiệm Học Coding Dành Cho Dân Trái Ngành",
        date: "26-07-2020"
    }
    

]
app.get("/", function(req, res){
    res.send("Hi bro, from server!")
})
app.get("/about", function(req, res){
    res.send("<h1>I'm snider men</h1>")
})
app.get("/todo", function(req, res){
    let quotes = ["Super Men","Captain American","Iron Men","Sniper Men"]
    res.render("index.ejs", {result: quotes})
})
app.post("/new-todos", function(req, res){
    let newTodos = req.body
   object.push(newTodos)
})
app.get("/todos", function(req, res){
    
    res.render("about.ejs", {result: object})
})
app.listen(3000, function(){
    console.log("hello world lol")
})
