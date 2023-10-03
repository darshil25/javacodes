public class Interfaces {
    public static void main(String[] args) {
        King k = new King();
        k.moves();
    }
}

interface ChessPlayer{
    void moves(); //by default this function is public and abstract
}

class Quenn implements ChessPlayer{
    public void moves(){ //here we have to make it public because it will be default if we don't right public
        System.out.println("up, down, right, left, diagonal(in all 4 directions)");
    }
}

class Hathi implements ChessPlayer{
    public void moves(){ //here we have to make it public because it will be default if we don't right public
        System.out.println("up, down, right, left)");
    }
}

class King implements ChessPlayer{
    public void moves(){ //here we have to make it public because it will be default if we don't right public
        System.out.println("up, down, right, left, diagonal --> by 1 step only");
    }
}