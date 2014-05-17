/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absence;
import java.util.*;

/**
 *
 * @author Danang
 */

public class Monster {
private LinkedList<Character> MonsQ;
private int Level; //Menentukan tingkat kesulitan monster
private String Jenis;//Jenis Monster-->ni gak berpengaruh sih...klo mau dihapus gpp
private String Nama;//Nama Monster
private int Size;

public Monster(String Nama, String Jenis,int Level){
   this.Level = Level;
   this.Jenis = Jenis;
   this.Size = getSize();
   this.Nama = Nama;
   MonsQ = new LinkedList<>();
   RandomChar();
}



//Getter_Setter

public void PrintList(){
    for(int i = 0; i<getSize();i++){
        System.out.print(getMonsQ().get(i)+" ");
    }
}
public LinkedList<Character> getMonsQ() {
    return MonsQ;
}
public void setMonsQ(LinkedList MonsQ) {
    this.MonsQ = MonsQ;
}
public int getLevel() {
    return Level;
}
public void setLevel(int Level) {
    this.Level = Level;
}
public String getJenis() {
    return Jenis;
}
public void setJenis(String Jenis) {
    this.Jenis = Jenis;
}
public String getNama() {
    return Nama;
}
public int getSize(){
    int lv;
    if( getLevel() == 1)
        lv = 30;
    else if(getLevel() == 2)
        lv = 35;
    else if(getLevel() == 3)
        lv = 40;
    else if(getLevel() == 4)
        lv = 45;
    else if(getLevel() == 5)
        lv = 50;
    else
        lv = 0;
    return lv;
}
@SuppressWarnings("empty-statement")
public void RandomChar(){
    char c;
    Random rand = new Random();
    char [] arah = {'u','d','l','r'} ;
    //u : up
    //d : down
    //l : left
    //r : right
    for(int i = 0; i < getSize(); i++){
        MonsQ.addLast(arah[(rand.nextInt(arah.length))]);
    }
}
 public static void main(String[] args) {
    // TODO code application logic here
     Monster M = new Monster("Black Widow", "Laba-Laba",5);
     System.out.println("Nama : " + M.getNama());
     System.out.println("Jenis: "+ M.getJenis());
     System.out.println("Level: "+ M.getLevel());
     System.out.print("List: ");M.PrintList();
   }
}










