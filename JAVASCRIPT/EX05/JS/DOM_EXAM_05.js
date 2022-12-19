window.addEventListener("load",function(){
    let section = document.querySelector("#section1");
    let titleInput = section.querySelector(".title-input");
    let addButton = section.querySelector("#add-button");
    let delButton = section.querySelector("#del-button");
    let menuList = section.querySelector(".menu-list");

    addButton.onclick =function(){
       let txtNode= document.createTextNode(titleInput.value);
    //    text 박스에 사용자가 입력한 값을 node로써 생성함 
       menuList.appendChild(txtNode);
    //    생성된 node를 자식으로써 메뉴리스트에 등록함
    }

    delButton.onclick =function(){
        let txtNode = menuList.childNodes[0];
        //메뉴리스트 중 첫번째 노드 (첫번째 자식)을 txtnode로 등록 
        menuList.removeChild(txtNode);
        // 메뉴리스트에서 등록된 첫번째 자식을 제거함. 
    }



});