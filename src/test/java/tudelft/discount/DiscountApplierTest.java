package tudelft.discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountApplierTest {

    private ProductDao mockDao;
    private DiscountApplier discountApplier;

    @BeforeEach
    void setUp() {
        mockDao = mock(ProductDao.class);
        discountApplier = new DiscountApplier(mockDao);
    }

    @Test
    void pruebaDescuentoCategoriaHome() {
        Product homeProduct = new Product("Home Product", 200.0, "HOME");

        when(mockDao.all()).thenReturn(Arrays.asList(homeProduct));

        discountApplier.setNewPrices();

        assertEquals(220.0, homeProduct.getPrice(), 0.0001);
    }

    @Test
    void pruebaDescuentoCategoriaBusiness() {
        Product businessProduct = new Product("Business Product", 100.0, "BUSINESS");
        Product homeProduct = new Product("Home Product", 100.0, "HOME");
        Product otherProduct = new Product("Other Product", 100.0, "OTHER");

        when(mockDao.all()).thenReturn(Arrays.asList(businessProduct, homeProduct, otherProduct));

        discountApplier.setNewPrices();

        assertEquals(90.0, businessProduct.getPrice(), 0.0001);
        assertEquals(110.0, homeProduct.getPrice(), 0.0001);
        assertEquals(100.0, otherProduct.getPrice(), 0.0001);
    }

    @Test
    void pruebaSinCambioParaOtrasCategorias() {
        Product otherProduct = new Product("Other Product", 150.0, "OTHER");

        when(mockDao.all()).thenReturn(Arrays.asList(otherProduct));

        discountApplier.setNewPrices();

        assertEquals(150.0, otherProduct.getPrice(), 0.0001);
    }
}
