package Falcon.Graph;
/**
 *
 * @author Falcon -> Pubudu,Achintha,Nethmi,Rajitha,Mano(Team Falcon)
 */
public class G_Calc
{
    public G_Calc(){}
    //Instance field Gui_Graph
    static G_UI gui = new G_UI();
    //Initialize Calculator Components
    private void Initialize(G_UI _GUI)
    {        
        _GUI.setVisible(true);        
    }
    //Run
    public void run() throws InterruptedException
    {
        Initialize(gui);
    }

}