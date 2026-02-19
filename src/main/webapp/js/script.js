"use strict";

let age = document.querySelector('.age');

for (let i = 1; i <= 100; i++) {
	let option = document.createElement('option');
	option.textContent = i;
	age.append(option);
}