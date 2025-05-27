// 1번 문제: 안녕하세요를 result1에 출력

function printText() {
  const divs = document.querySelector("#result1");
  divs.textContent = "안녕하세요";
}

// 2번 문제
const result2 = document.querySelector("#result2");
const customer = document.querySelector("#customer");
function printInputValue() {
  //input 값을 (customer)을 가지고 오기
  console.log(customer.value);
  //가지오 와서 result2에 출력
  result2.textContent = customer.value;
  //input 값(customer.value)을 비우기
  customer.value = "";
}

// 3번 문제
function changeColor() {
  // 선택한 divTest에 배경색을 변경 해라
  const divs = document.querySelector(".div-test");
  divs.style.backgroundColor = "orange";
}

// 4번 문제
function stringLength() {
  const div1 = document.querySelector("#result4");
  const text = document.querySelector("#text");
  //입력받은 text에서 글자의 글자수 가져오기
  //글자수를 result4에 출력
  console.log(text.value.length);
  result4.textContent = text.value.length;
}

// 5번 문제
const la = document.querySelector("#la");
const result5 = document.querySelector("#result5");
function stringSplit() {
  //1.사과, 바나나, 오렌지, 포도 문자 갖고 오기
  console.log(la.textContent);
  const laText = la.textContent;
  //2. 가지고 온 문자 분리하기 -> 배열 (split)
  console.log(la.textContent.split(","));
  const laArr = laText.split(",");

  //6. ul태그 만들기
  const ul = document.createElement("ul");
  //3. 배열 값 하나씩 가지고 오기 -> 반복문
  for (let i = 0; i < laArr.length; i++) {
    //console.log(laArr[i]);
    //4. li태그 만들기
    const li = document.createElement("li");
    //5.li태그에 값넣기
    li.textContent = laArr[i];
    console.log(li);
    //7.ul태그에 만들어 놓은 li 태그 추가하기
    ul.appendChild(li);
    // ul.innerHTML += "<li>" + laArr[i] + "</li>";
    //ul.innerHTML += `li${laArr[i]}li`;
  }
  console.log(ul);
  //result5에ul담기
  result5.appendChild(ul);
}

// 6번 문제
function arrayTest() {
  //피자 치킨 떡볶이 <- 배열로 만들기
  const food = document.querySelector("#preview");
  const remove = document.querySelector("#remove");
  console.log(food.textContent.split(" "));
  const food1 = food.textContent.split(" ");
  /*
  //1. 반복문
  for (let i = 0; i < food1.length; i++) {
    //이미 가지고 있는 값에서 내가 삭제할 값이 일치하면 배열에서 제거
    //console.log(food1[i] === "피자");
    if (food1[i] === remove.value) {
      food1.splice(i, 1);
    }
  }*/

  //2.배열에서 제거 : splice(인덱스,1)
  const delIdx = food1.indexOf(remove.value);
  console.log(delIdx);
  //if (delIdx !== -1) food1.splice(delIdx, 1);

  //+)추가
  console.log(food1.includes(remove.value));
  if (food1.includes(remove.value)) food1.splice(delIdx, 1);
  //추가 -> 배열에 해당 값 추가! push
  food1.push(add.value);

  //배열-> 문자열로 바꾸기
  console.log(food1.join(" "));
  food.textContent = food1.join(" ");
}

// 7번 문제 prompt로 이름,나이, 주소 순으로 입력받아서 출력(총3명)
const names = document.querySelectorAll(".name");
const ages = document.querySelectorAll(".age");
const addrs = document.querySelectorAll(".addr");
function addStudent() {
  console.log(names);
  for (let i = 0; i < 3; i++) {
    const name = prompt(`${i}번째 학생 이름`);
    const age = prompt(`${i}번째 나이`);
    const addr = prompt(`${i}번째 주소`);
    names[i].textContent = name;
    ages[i].textContent = age;
    addrs[i].textContent = addr;
  }
}

// 8번
const list = document.querySelector("#list");
function addItem() {
  //1. li 태그를 만들어 추가하는 방식
  const li = document.createElement("li");
  li.textContent = "테스트";
  list.appendChild(li);

  //2.innerHTML로 문자를 추가하는 방식
  list.innerHTML += "<li></li>";
}

function removeItem() {
  // 1. 부모에서 제거
  //console.log(list.childNodes);
  //list.removeChild(list.childNodes[0]);
  //2. 본인이 제거
  const li = document.querySelector("#list li");
  li.remove();
}
// 9번
const result9 = document.querySelector("#result9");
function toggleClass() {
  result9.classList.toggle("active");
}

// 10번
const item = document.querySelector("#item");
const price = document.querySelector("#price");
const cart = document.querySelector("#cart");
const total = document.querySelector("#total span");
let sum = 0;
function addToCart() {
  cart.innerHTML += `<li>${item.value}-${price.value}</li>`;

  console.log(isNaN(Number(price.value))); //Nan
  if (!isNaN(Number(price.value))) sum += Number(price.value);
  total.innerHTML = sum;

  console.log(sum);

  item.value = "";
  price.value = "";
}
