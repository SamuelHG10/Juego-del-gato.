

package miJuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Samuel Hernández Gómez
 */
class clickEnBoton implements ActionListener {
    private final VentanaJuego outer;

    clickEnBoton(final VentanaJuego outer) {
        this.outer = outer;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 1; i <= 9; i++) {
            if (outer.botones[i].equals(e.getSource())) {
                //Source trae el boton de origen
                if (outer.botones[i].getText().isEmpty()) {
                    outer.tirada(i);
                }
                break;
            }
        }
    }
    
}
