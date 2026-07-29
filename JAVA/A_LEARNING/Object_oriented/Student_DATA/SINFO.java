package A_LEARNING.OOPS_PRACTICE.Student_DATA;

public class SINFO {
    String name;
    int rollno;
    String goodorbad;

    public SINFO(String n, int r, String gb){
        this.name = n;
        this.rollno = r;
        this.goodorbad = gb;
    }

    public void INtro(int srno){

	    // %-6d = 6 space for sr.no(left allignment)
	    // %-12s = 15 space for name
	    // %-8d = 8 space for rollno
	    // %s%n = other left space for goodorbad
        
        System.out.printf("%-5d | %-12s | %-6d | %s%n",srno,name, rollno, goodorbad);
    }
    public String savefile(){
        return name + ", " + rollno+", "+goodorbad;
    }

    public String toFileFormat() {
        throw new UnsupportedOperationException("Unimplemented method 'toFileFormat'");
    }
}
