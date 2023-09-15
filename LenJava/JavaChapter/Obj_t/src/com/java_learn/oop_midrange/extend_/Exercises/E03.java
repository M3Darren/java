package com.java_learn.oop_midrange.extend_.Exercises;

public class E03 {
    public static void main(String[] args) {
        Pc p=new Pc("i5","8G","固态","DELL");
        p.info();
        NotePad n=new NotePad("骁龙8900","16G","机械","air blue");
        n.info();
    }
}
class Computer{
    protected String Cpu;
    protected  String Memory;
    protected  String Disk;

    public Computer(String cpu, String memory, String disk) {
        Cpu = cpu;
        Memory = memory;
        Disk = disk;
    }

    public String getDetail(String type){
        System.out.println("=========="+type+"=========");
        if ("Pc".equals(type)){
          return "\tCpu\tMemory\tDisk\tbrand\n"+"\t"+this.Cpu+"\t"+this.Memory+"\t"+this.Disk+"\t";
        }else{
            return "\tCpu\tMemory\tDisk\tcolor\n"+"\t"+this.Cpu+"\t"+this.Memory+"\t"+this.Disk+"\t";
        }

    }
}
class Pc extends Computer{
    private String brand;

    public Pc(String...arr) {

        super(arr[0],arr[1],arr[2]);
        this.brand=arr[3];
    }
    public void info(){
        System.out.println(getDetail("Pc")+this.brand);
    }
}
class NotePad extends Computer{
    private String color;

   NotePad(String...arr){
      super(arr[0],arr[1],arr[2]);
       this.color=arr[3];
   }
    public void info(){
        System.out.println(getDetail("NotePad")+this.color);
    }
}

