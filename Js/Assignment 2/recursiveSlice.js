var arr1 = [1,3,5,4,2];
        var i=0, j=1;
        find(arr1, isEven);

        function find(arr, isEven){
            if(isEven(arr[i]))
                console.log("value: ",arr[i],"<br>");
            else{
                console.log("j: ",j);
                console.log(arr);
                console.log(arr.slice(j,5));
                find(arr.slice(j,5),isEven);
                j++;
            }
        }
        function isEven(number){
            return (number%2==0);
        }