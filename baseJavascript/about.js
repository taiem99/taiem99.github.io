//bài 1 viết hàm tính công thức tính thể tích hình cầu
function vGlobular(radius){
    return Math.pow(radius, 3) * 3.14159 * 4 / 3;
}

// bài 2: viết hàm tính tổng các số nguyên giữa 2 số truyền vào.
function sumInteger(a, b){
    let sum = 0;
    if(Number.isInteger(a) && Number.isInteger(b)){
        if(a < b){
            for(let i = a + 1; i < b; i++){
                sum += i;
            }
        } 
        else if(a > b){
            for(let i = b + 1; i < a; i++){
                sum += i;
            }
        }
    } else 
    sum = null;
    return sum;
}

// bài 3 : Cho 1 số, kiểm tra xem số đó có phải là số nguyên tố hay không, kết quả trả về true hoặc false.
function numberPrime(a){
    let status = true;
    if(Number.isInteger(a)){
        if(a < 2){
            status = false;
        } else {
            for(let i = 2; i <= a / 2; i++){
                if(a % i == 0){
                    status = false;
                    break;
                } else
                status = true;
            }
        }
    } else
    status = null;
    return status;
}
//bài 4: Cho 1 số nguyên dương bất kỳ. Tính tổng tất cả các số nguyên tố mà nhỏ hơn hoặc bằng tham 
// số truyền vào.
function sumPrimeNumber(n){
    let sum = 0;
    if (Number.isInteger(n) && n > 0){
        for(let i = 1; i <= n; i++){
            if (numberPrime(i)){
                sum += i;
            }
        }
    } else 
    sum = null;
    return sum;
}

//bài 5:  Cho 1 số nguyên dương, viết hàm tính tổng tất cả các ước số của số đó.

function sumFactor(n){
    let sum = 0;
    if (Number.isInteger(n) && n > 0){
        for(let i = 1; i <= n; i++){
            if(n%i==0){
                sum += i;
            }
        }
    } else sum = null;
    return sum;
}

//bài 6:  Viết hàm để lấy danh sách các key của object
function listKeys(object){
    return Object.keys(object);
}
// bài 7: Viết hàm để lấy danh sách các value của object
function listValues(object){
    return Object.values(object);
}
//bài 8: Viết hàm kiểm tra key có tồn tại trong Object không
function checkKey(nameKey, object){
    return listKeys(object).includes(nameKey);
}
//bài 9: Viết hàm kiểm tra Object có độ dài bao nhiêu
function getLengthObject(object){
    return Object.keys(object).length;
}
// bài 10:
function getDataAge(arr){
    let arr2;
    for(let i = 0; i < arr.length; i++){
        if (arr[i].age >25 && arr[i].isStatus == true){
            arr2.push(arr[i])
        }
    }
    return arr2;
}
//bài 11: sắp xếp mảng với tuổi tăng dần
function sortArr(arr){
    return arr.sort((a, b) => a.age - b.age);
}
