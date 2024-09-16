import junit.framework.TestCase;

import org.junit.Test;

import Objetos.*;
import Repositorios.*;
import Tipos.Tipo;

/**
 * TesteRepositorio
 */
public class TesteRepositorio extends TestCase {
    private Loja lojaBase = new Loja("Alto da esperança", 0, "William LTDA", "William", Tipo.ATACADO, "2513");

    @Test
    public void testMakeLoja() {
        RLojas rLojas = new RLojas();
        Loja lojafantasia = rLojas.make("Alto da esperança", "William LTDA", "William", Tipo.ATACADO, "2513");
        assertEquals(lojaBase, lojafantasia);
    }
}