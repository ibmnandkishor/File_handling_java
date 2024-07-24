interface abc{
    int operate(int a,int b);
}

 class Lambdafunction{
    public static void main(String[] args){
        abc addition=(a,b)->a+b;

        int result=addition.operate(20,30);
        System.out.println(result);
    }
}



class Hello{

    
interface abc{
    int operate(int a,int b);
}
    public static void main(String[] args){
       
        abc add=(a,b)->a+b;

        int result=add.operate(10,20);
        System.out.println(result);
    }
}