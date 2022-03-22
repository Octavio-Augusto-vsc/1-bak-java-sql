package service;

import dao.IDao;
import model.Hotel;

public class HotelService {

    private IDao<Hotel> hotelIdao;

    public HotelService(IDao<Hotel> hotelIdao) {
        this.hotelIdao = hotelIdao;
    }

    public  Hotel salvar(Hotel hotel){
        hotelIdao.salvar(hotel);
        return hotel;
    }
}
