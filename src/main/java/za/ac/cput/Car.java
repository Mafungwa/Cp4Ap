package za.ac.cput;

class Car extends Transport{
    private String name = "Polo";
    public String move(){
        return name;
    }
    void moveFather(){
        Transport f =new Transport();
        f.move();
    }
    Transport objT = new Transport();
    void mT(){
        objT.move();
    }

}
