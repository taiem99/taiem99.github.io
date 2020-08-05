// String

// bài 1
function checkString(str1,str2){
    if(str1.includes(str2) == true){
        return true;
    } else
    return false;
}
// bài 2

function shortenString(str){
    str = str.slice(0,8) + "...";
    return str;
}
// bài 3
function capitalizeString(str){
    let arr = str.split(" ")
	str = arr.map(function(a){
		return a.charAt(0).toUpperCase() + a.substring(1).toLowerCase();
    })
    return str.join(" ");
}

// bài 4
function repeat(str){
    let a = "";
    for(let i = 1; i<=10; i++){
        a = a + str;
    }
    return a;
}

// bài 5
function repeatString(str){
    let a = str;
    for(let i = 1; i<10; i++){
        a = a + "-" + str;
    }

    return a;
}

// bài 6
function repeatStringNumber(str,n){
    let a = str;
    if(n>0){
        for(let i = 1; i<n; i++){
            a = a + "-" + str;
        }
        return a;
    } else
    return null; // trả về gt null nếu n <= 0
}
// bài 7
function reverseString(str){
    let str1 = "";
    for(let i = str.length - 1; i >= 0; i-- ){
        str1 += str[i];
    }
    return str1;
}

// bài 8
function doiXung(str){
    str = str.toLowerCase();
    for(let i = 0; i < str.length/2;i++){
        if(str[i] != str[str.length - 1 - i]){
            return false;
        } else 
        return true;
    }
}


// Array

// bài 1
function minNumber(arr){
    let min = arr[0];
    for(let i = 0; i < arr.length; i++){
        if(min > arr[i]){
            min = arr[i];
        }
    }
    return min;
}

// bài 2

function max2Numbers(arr){
    arr = arr.sort((a,b) => b - a);
    for(let i = 1; i < arr.length; i++){
        if(arr[i] - arr[i-1] < 0){
            return arr[i];
        }
        else
        return "chỉ có số lớn nhất, ko có số lớn thứ 2";
    }
}
// bài 3
function sortStudent(arr){
    arr = arr.sort();
    let arr1 = [];
    for(let i = 0; i< arr.length; i++){
        arr1.unshift(arr[i]);
    }
    return arr1;
}

// bài 4
function tongChia5(){
    let sum = 0;
    for(let i = 1; i <= 100; i++){
        if(i % 5 == 0){
            sum = sum + i;
        }
    }
    return sum;
}

// bài 5
function chiaDu2(arr){
    let arr2 = [];
    for(let i = 0; i < arr.length; i++){
        arr2.push(arr[i] % 2);
    }
    return arr2;
}

// bài 6
function phanTuLonNhat(arr){
    let max = 0;
    for(let i = 0; i < arr.length; i++){
        if(arr[i].length > max){
            max = arr[i].length;
        }
    }
    let arr1 = [];
    for(let i = 0; i < arr.length; i++){
        if(arr[i].length == max){
            arr1.push(arr[i]);
        }
    }
    return arr1;
}

