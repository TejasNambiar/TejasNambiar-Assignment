var bool = false;

function deliverPizza(){
    var form = document.getElementById("pizzaForm");
    
    var checks = form.getElementsByTagName("input");
    var checked = 0;
    for (var i = 0; i < checks.length; i++) {
        if (checks[i].checked) {
            checked++;
        }
    }

    if(form.name.value == ""){
        document.getElementById("compInfo").innerHTML = "Please provide your name";
        form.name.focus();
        return false;
    }
    
    else if(form.email.value == "" || form.email.value.indexOf('@') == -1){
        document.getElementById("compInfo").innerHTML = "Please provide your email";
        form.email.focus();
        return false;
    }

    else if(checked == 0){
        document.getElementById("compInfo").innerHTML = "Please provide your toppings";
        form.name.focus();
        return false;
    }

    else if(form.address.value == ""){
        document.getElementById("compInfo").innerHTML = "Please provide your address";
        form.name.focus();
        return false;
    }    
    bool = true;
}

var form = document.getElementById("pizzaForm");
    
    document.getElementById("name1").innerHTML = "Name: "+ form.name.value;
    document.getElementById("email-table").innerHTML = form.email.value;
    document.getElementById("topings-table").innerHTML = form.topings.value;
    document.getElementById("medium-table").innerHTML = form.medium.value;
    document.getElementById("tip-table").innerHTML = form.topings.value;
    document.getElementById("address-table").innerHTML = form.address.value;
function summary(){

}