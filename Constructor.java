/*Constructor in Java */
class Constructor {
    private int t;
    private String s;
    // public int getT() {
    //     return t;
    // }

    // public void setT(int t) {
    //     this.t = t;
    // }

    // public String getS() {
    //     return s;
    // }

    // public void setS(String s) {
    //     this.s = s;
    // }

    
    

    Constructor(String s, int t) {
        this.s = s;
        this.t = t;
    }

    void display() {
        System.out.println(s + " " + t);

    }

    public static void main(String[] args) {
        Constructor t1 = new Constructor("saket",125);
        // t1.setS("saket suamn");
        // t1.getS();
        // t1.setT(125);
        // t1.getT();
         t1.display();
    }

}
