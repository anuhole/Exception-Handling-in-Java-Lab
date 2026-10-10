public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int breadth, int length)  throws IlegalSizeExeception{
        if(length <=0 || breadth <=0){
            throw new IlegalSizeExeception("Length and breadth cannot be les than 0");
        }
        this.breadth = breadth;
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) throws IlegalSizeExeception {
        if(breadth <=0){
            throw new IlegalSizeExeception("Breath cannot less than 0");
        }
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) throws IlegalSizeExeception {
        if(length <=0){
            throw  new IlegalSizeExeception("Length cannot be less than 0");
        }
        this.length = length;
    }

    public int calculateArea(){
        return this.length+this.breadth;
    }
    public int calculatePerimeter(){
        return (2+(this.length*this.breadth));
    }
}
