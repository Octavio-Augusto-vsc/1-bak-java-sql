package test;

import dao.config.ConfigJDBC;
import dao.impl.HotelDaoH2;
import model.Hotel;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.HotelService;

import static org.junit.jupiter.api.Assertions.*;

public class HotelServiceTest {

    private static final Logger LOGGER = Logger.getLogger(test.HotelServiceTest.class);

    private HotelService hotelService = new HotelService(
            new HotelDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarHotelNoH2() {
        LOGGER.info("Cadastrando o endereço no H2...");
        Hotel hotel1 = hotelService.salvar(new Hotel("hotel vagabundo","dos tolos",0, "Presidente Olegario", "MG",1));
    }
}

