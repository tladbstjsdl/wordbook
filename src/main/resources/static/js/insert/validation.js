const idRegex = /^[A-Za-z]([\d\w.]{4,14})$/;
const passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*()\-_=+\\/.,<>`~[\]{}])[A-Za-z\d!@#$%^&*()\-_=+\\/.,<>`~[\]{}]{8,16}$/;
const emailRegex = /^.*@\w+\.(?!_)[A-Za-z]{2,3}\.(?!_)[A-Za-z]{0,2}$/;
const phoneRegex = /^\d{9,11}$/;
window.addEventListener("DOMContentLoaded", function() {
	const idInput = document.querySelector("input#memberId");
	const idWarning = document.querySelector("span[name=memberId]");
	const passwordInput = document.querySelector("input#password");
	const passwordWarning = document.querySelector("span[name=password]");
	const passwordConfirmInput = document.querySelector("input#passwordConfirm");
	const passwordConfirmWarning = document.querySelector("span[name=passwordConfirm]");
	const emailInput = document.querySelector("input#email");
	const emailWarning = document.querySelector("span[name=email]");
	const phoneInput = document.querySelector("input#phone");
	const phoneWarning = document.querySelector("span[name=phone]");
	const addressInput = document.querySelector("input#address");
	const addressWarning = document.querySelector("span[name=address]");
	const submitBtn = document.querySelector("#submit");

	idInput.addEventListener("blur", function() {
		if(!idRegex.test(idInput.value)) {
			idWarning.innerText = "ID는 5~15 글자 사이의 알파벳으로 시작하는 알파벳 숫자 . _ 만 가능합니다.";
		}
		else {
			idWarning.innerText = "";
		}
	});
	passwordInput.addEventListener("blur", function() {
		if(!passwordRegex.test(passwordInput.value)) {
			passwordWarning.innerText = "비밀번호는 알파벳 대문자, 소문자, 숫자, 특수기호를 최소 하나씩은 포함하는 8~16 자리만 가능합니다.";
		}
		else {
			passwordWarning.innerText = "";
		}
	});
	passwordConfirmInput.addEventListener("blur", function() {
		if(passwordConfirmInput.value !== passwordInput.value) {
			passwordConfirmWarning.innerText = "비밀번호가 다릅니다.";
		}
		else {
			passwordConfirmWarning.innerText = "";
		}
	});
	emailInput.addEventListener("blur", function() {
		if(!emailRegex.test(emailInput.value)) {
			emailWarning.innerText = "이메일 형식을 맞춰주세요.";
		}
		else {
			emailWarning.innerText = "";
		}
	});
	phoneInput.addEventListener("blur", function() {

	});
	addressInput.addEventListener("blur", function() {

	});

	submitBtn.onclick = function() {
		if(!idRegex.test(idInput.value)) {
			alert("ID는 5~15 글자 사이의 알파벳으로 시작하는 알파벳 숫자 . _ 만 가능합니다.");
			idWarning.innerText = "ID는 5~15 글자 사이의 알파벳으로 시작하는 알파벳 숫자 . _ 만 가능합니다.";
			idInput.focus();
			return false;
		}
		else if(!passwordRegex.test(passwordInput.value)) {
			alert("비밀번호는 알파벳 대문자, 소문자, 숫자, 특수기호를 최소 하나씩은 포함하는 8~16 자리만 가능합니다.");
			passwordWarning.innerText = "비밀번호는 알파벳 대문자, 소문자, 숫자, 특수기호를 최소 하나씩은 포함하는 8~16 자리만 가능합니다.";
			passwordInput.focus();
			return false;
		}
		else if(passwordConfirmInput.value !== passwordInput.value) {
			alert("비밀번호가 다릅니다.");
			passwordConfirmWarning.innerText = "비밀번호가 다릅니다.";
			passwordConfirmInput.focus();
		}
		else if(!emailRegex.test(emailInput.value)) {
			alert("이메일 형식이 틀렸습니다.");
			emailWarning.innerText = "이메일 형식을 맞춰주세요.";
			emailInput.focus();
		}
	}
})