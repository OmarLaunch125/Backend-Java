package semana3;

public class Ashe extends  Champion implements AsheActionCallbacks{

    public Ashe(int, id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        System.out.println("Lanzo una flecha");
        s.setVisible(true);
        s.out(showMessage(), font:"Helvetica", size:28, Colors.BlueHorizon);
        s.showImage(f:"FrostShot.gif");
        s.setBounds(x:200,y:100,width:1100, height:900);
    }

    @Override
    public void hawkShort(Screen s) {
        s.cls();
        s.repaint();
        System.out.println("Lanzo una flecha");
        s.setVisible(true);
        s.out(showMessage(), font:"Helvetica", size:28, Colors.BlueHorizon);
        s.showImage(f:"Hawkshot.gif");
        s.setBounds(x:200,y:100,width:1100, height:900);

    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:28, Colors.BlueHorizon);
        s.showImage(f:"RangerFocuss.gif");
        s.setBounds(x:200,y:100,width:1100, height:900);

    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:28, Colors.BlueHorizon);
        s.showImage(f:"Volley.gif");
        s.setBounds(x:200,y:100,width:1100, height:900);

    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:28, Colors.BlueHorizon);
        s.showImage(f:"CrystalArrow.gif");
        s.setBounds(x:200,y:100,width:1100, height:900);
    }
}
