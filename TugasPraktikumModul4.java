package com.example;

public class Main {
    public static BusinessLogic businessLogic = new BusinessLogic();

    public static String[] model = new String[10];

    public static java.util.Scanner scanner  = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        
    }

    /**
     * menginput data
     */
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
}

/**
 * Class Untuk Business Logic 
 */
class BusinessLogic{
    public static String[] model = new String[10];

    /**
     * Menampilkan todo list
     */
    public void showTodoList(){
        System.out.println("--TODOLIST--");
        for(var i = 0; i < model.length; i++){
            var nomor = i + 1;
            var todo = model[i];

            if (todo != null){
                System.out.println(nomor + ". " + todo);
            }
        }
    }

    /**
     * Menambah todo ke list
     */
    public void addTodoList(String todo){
        //Cek apakah model penuh?
        var isFull = true;
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //Jika penuh, kita resize ukuran array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];
            for(var i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }
        //Tambahkan ke posisi yang data arraynya Null
        for (var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Menghapus todo dari list
     */
    public boolean removeTodoList(Integer number){
        if((number - 1) >= model.length){
            return false;
        }else if(model[number - 1] == null){
            return false;
        }else{
            model[number - 1] = null;
            for(int i = (number - 1); i < model.length; i++){
                if(i == (model.length - 1)){
                    model[i] = null;
                }else{
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }
}
