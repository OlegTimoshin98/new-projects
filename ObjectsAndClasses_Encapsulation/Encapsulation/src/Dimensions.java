public class Dimensions {
    private final int width; //ширина
    private final int height; //выоста
    private final int length; //длина

    public Dimensions(){
        width = 0; height = 0; length = 0;
    }

    public Dimensions(int width, int height, int length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {return width;}

    public int getHeight() {return height;}

    public int getLength() {return length;}

    public Dimensions setWidth(int width){
        return new Dimensions(width, height, length);    }

    public Dimensions setHeight(int height){
        return new Dimensions(width, height, length);    }

    public Dimensions setLength(int length){
        return new Dimensions(width, height, length);    }

    public int getDimensions(){return (width*height*length);}

    public String toString(){return width + "х" + height + "х" + length + " = " + (width*height*length);}
}
