//영문자로 시작하고 영문자와 숫자 조합으로 4~12자 이내
const id = document.querySelector("#Id");
const result = document.querySelector("#result");
//console.log(id);
id.addEventListener("input", (e) => {
  id1 = /^[a-zA-Z][a-zA-Z0-9]{3,11}$/;
  console.log(id1.test(e.target.value));
  if (id1.test(e.target.value)) {
    console.log("아이디 사용가능");
    result.innerHTML = "아이디 사용가능";
    result.style.color = "red";
  } else {
    console.log("아이디 사용 불가 다시 입력하세요");
    result.innerHTML = "아이디 사용 불가 다시 입력하세요";
  }
});

//영문자, 숫자, 특수문자 조합으로 8~15자 이내
const pw = document.querySelector("#Pw");
console.log(pw);
pw.addEventListener("input", (e) => {
  let pw1 = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,15}$/;
  if (pw1.test(e.target.value)) {
    console.log("아이디 사용가능");
    result1.innerHTML = "비밀번호 사용가능";
    result1.style.color = "red";
  } else {
    console.log("아이디 사용 불가 다시 입력하세요");
    result1.innerHTML = "비밀번호 사용 불가 다시 입력하세요";
  }
});
//위 비밀번호와 동일하게
const pw2 = document.querySelector("#Pw2");
pw2.addEventListener("input", () => {
  if (pw.value === pw2.value) {
    console.log("아이디 사용가능");
    result2.innerHTML = "비밀번호 사용가능";
    result2.style.color = "red";
  } else {
    console.log("아이디 사용 불가 다시 입력하세요");
    result2.innerHTML = "비밀번호 사용 불가 다시 입력하세요";
  }
});
//한글 2자 이상
const name = document.querySelector("#Name");
console.log(name);
name.addEventListener("input", (e) => {
  let name1 = /^[가-힣]{2,}$/;
  if (name1.test(e.target.value)) {
    console.log("이름 사용가능");
    result3.innerHTML = "이름 사용가능";
    result3.style.color = "red";
  } else {
    console.log("아이디 사용 불가 다시 입력하세요");
    result3.innerHTML = "이름 사용 불가 다시 입력하세요";
  }
});
//이메일 형식
const maill = document.querySelector("#Im");
console.log(maill);
maill.addEventListener("input", (e) => {
  let maill1 = /^[\w.-]+@[\w.-]+\.[A-Za-z]{2,}$/;
  if (maill1.test(e.target.value)) {
    console.log("아이디 사용가능");
    result4.innerHTML = "이메일 사용가능";
    result4.style.color = "red";
  } else {
    console.log("아이디 사용 불가 다시 입력하세요");
    result4.innerHTML = "이메일 사용 불가 다시 입력하세요";
  }
});
//전화번호를 입력해주세요
const nb = document.querySelector("#Nb");
console.log(nb);
nb.addEventListener("input", (e) => {
  let nb1 = /^010-\d{4}-\d{4}$/;
  if (nb1.test(e.target.value)) {
    console.log("아이디 사용가능");
    result5.innerHTML = "전화번호 사용 가능";
    result.style.color = "red";
  } else {
    console.log("아이디 사용 불가 다시 입력하세요");
    result.innerHTML = "전화 번호 사용 불가 다시 입력하세요";
  }
});
const ok = document.querySelector("#ok");
ok.addEventListener("click", () => {
  if (
    id === true &&
    pw1 === true &&
    pw2 === true &&
    nb1 === 0 &&
    maill === true &&
    name === true
  )
    alert("회원가입을 축하드립니다");
});
