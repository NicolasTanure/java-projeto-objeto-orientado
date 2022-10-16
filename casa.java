
/**
 * Escreva uma descrição da classe desenho1 aqui.
 * 
 * Nicolas Tanure Miszczuk
 * @version (um número da versão ou uma data)
 */
public class casa
{
    public static void main(String args[]){
        Square quad1 = new Square();
        Circle sol=new Circle();
        Triangle telhado=new Triangle();
        Square janela = new Square();
        Square porta = new Square();
        Square chao = new Square();
        
        quad1.makeVisible();
        quad1.changeSize(100);
        quad1.changeColor("black");
        quad1.moveVertical(100);
        sol.makeVisible();
        sol.changeColor("yellow");
        sol.changeSize(80);
        sol.moveHorizontal(200);
        sol.moveUp();
        sol.moveVertical(-30);
        telhado.changeSize(100,150);
        telhado.makeVisible();
        telhado.moveDown();
        telhado.moveHorizontal(60);
        telhado.moveVertical(30);
        telhado.changeColor("red");
        janela.makeVisible();
        janela.changeSize(20);
        janela.changeColor("red");
        janela.moveVertical(120);
        janela.moveHorizontal(10);
        janela.makeVisible();
        porta.makeVisible();
        porta.changeSize(30);
        porta.changeColor("red");
        porta.moveVertical(170);
        porta.moveHorizontal(40);
        porta.makeVisible();
        chao.makeVisible();
        chao.changeSize(400);
        chao.changeColor("green");
        chao.moveVertical(200);
        chao.moveHorizontal(-60);
        
    }
}
