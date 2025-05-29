const click = document.querySelector("section button:first-child");
const img = document.querySelectorAll("img");
const span = document.querySelector("button span");
const h3 = document.querySelector("h3");
const restart = document.querySelector("section button:last-child");
console.log(img);
console.log(span);
//chlick:클릭 이벤트를 걸어야 하는 애
//img:내가 클릭을 했을때 바꿔야 하는 애
let count = 0;

const game = () => {
  const random = [
    Math.floor(Math.random() * 3) + 1,
    Math.floor(Math.random() * 3) + 1,
    Math.floor(Math.random() * 3) + 1,
  ];
  for (let i = 0; i < img.length; i++) {
    //랜덤값 :1~3까지
    console.log(random);
    img[i].setAttribute("src", `assets/spy${random[i]}.jpg`);
  }
  // 클릭할 때마다 카운트 증가
  span.textContent = ++count;

  //이미지 3개가 일치한 경우 버튼 disabled 처리
  // click.setAttribute("disabled", game);
  //click.setAttribute("disabled", disabled);
  if (random[0] === random[1] && random[1] === random[2]) {
    click.disabled = true;
    // h2에visivility:visible로 변경

    h3.style.visibility = "visible";
  }
};
const end = () => {
  // 이미지는 처음 그대로 1,2,3 순서대로 보이게 하고
  for (let i = 0; i < img.length; i++) {
    img[i].setAttribute("src", `assets/spy${i + 1}.jpg`);
  }
  //count는 0으로 바꾸고 span은 비우고
  count = 0;
  span.innerHTML = "";
  //h2 visibility= hidden 처리
  h3.style.visibility = "hidden";
  //click 버튼의 disable false 처리
  click.disabled = false;
};

click.addEventListener("click", game);
restart.addEventListener("click", end);
