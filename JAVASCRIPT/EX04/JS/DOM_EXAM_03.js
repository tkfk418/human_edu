window.addEventListener("load", function(){
    let section = document.getElementById("section1");
    let srcInput = section.querySelector("#src-input");
    let imgList = section.querySelector("#img-list")
    let changeButton = section.querySelector("#change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function(){
     
        img.src = "IMGS/"+srcInput.value+".jpg";
    }
    

});