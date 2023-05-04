/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.try_catch_finally_exception;


//Oluşan hatalara göre kullanıcıları farklı sayfalara yönlendirmek isteyebiliriz
//banka hesabında para bittiyse para yüklemesi için gereken sayfaya yönlendiririz
//Bu durumların yakalanması için spesifik hatalar tanımlanır


public class Try_catch_finally_exception {

    public static void main(String[] args) {
        
       try{  //hata oluşturabilecek kod betiğini buraya tanımlarız
           int[] sayilar=new int[]{1,2,3};
           System.out.println(sayilar[4]);
           
       }catch(StringIndexOutOfBoundsException exception){ //verilen hata oluştuğunda çalışır
           System.out.println(exception);
       
       }catch(ArrayIndexOutOfBoundsException exception){//verilen hata oluştuğunda çalışır
           
           System.out.println(exception);
       
       }catch(Exception exception){ //diğer bütün hataları kapsar.
           
           System.out.println(exception);
       
       }finally{  //her zaman çalışacak kod betiğidir
           
           System.out.println("her zaman calisacak blok");
       }
        
        
    }
}
