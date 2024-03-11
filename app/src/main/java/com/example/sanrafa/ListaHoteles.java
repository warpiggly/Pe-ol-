package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerViewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);

        recyclerViewHoteles=findViewById(R.id.listadinamicashoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador= new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);

    }

    public void crearListaHoteles(){
        listaHoteles.add(new Hotel("Hoteles del mar vendra"," Habitaciones desde $300000 COP","Del Mar Vendra dispone de jardín, terraza, restaurante y bar en Manaure Viejo. El alojamiento ofrece servicio de habitaciones, servicio de conserjería y servicio de organización de tours.\n" +
                "                        Las habitaciones de este alojamiento están equipadas con baño privado y wifi gratis. Algunas habitaciones están equipadas con vistas a la ciudad.\n","Nuestras lineas de atención son 300528978","a 25km del aereopuerto de Rioacha",4,R.drawable.hotel3));

        listaHoteles.add(new Hotel("Wayira beach","Habitaciones desde $500000 COP","Experiencias memorables en las vacaciones o días de descanso.\n >Hotel en frente de la playa donde podras disfrutar tus vacaciones con tranquilidad y privacidad. \n Nuestro todo incluido. Tiquetes, hoteles, comida, bebida y tarjeta de asistencia médica. ","Nuestras lineas de atención son: 304789632","a 30 minutos del aeropuerto de Riohacha",5,R.drawable.hotel2));

        listaHoteles.add(new Hotel("Hotel Palaaima","Habitaciones desde $100000 COP","en su entorno podrá disfrutar de la explotación artesanal e industrial de las \"Salinas de Manaure\" y el lugar de paso de los Flamencos Rosados (Musichi), además podrá disfrutar de la comodidad de ser atendido en un ambiente familiar. ","Nuestras Lineas de atención son: 300285798","carrera 6 N° 7- 34 Manaure (La Guajira) a orilla del Mar Caribe",3,R.drawable.hotel4));

        listaHoteles.add(new Hotel("AIWA HOTEL","Habitaciones desde $250000 COP","AIWA habla de un lugar en donde lo divino y lo terrenal confluye, para brindar un bienestar total. \n" +
                "Inspirados en la majestuosidad del desierto, decidimos crear un espacio en donde se conecten la comodidad y la rusticidad en un entorno puro y natural.\n" +
                "¡Bienvenido(a) a AIWA BEACH MAYAPO, tu escape perfecto en el desierto!","Nuestras lineas de atención son: 321789412","El aeropuerto (Aeropuerto de Riohacha) está a 25 km.",4,R.drawable.hotel4));

        listaHoteles.add((new Hotel("HOTEL KAI KASHI","Habitaciones desde $ 250000 COP","Somos un hotel de playa en medio del desierto Guajiro, rodeado de la mágia y encanto de la misticidad Wayuu. Espacios propicios para la práctica de deportes náuticos, y esparcimientos en familia, buena comida, habitaciones ampliasycoon baño interno, tv pantalla plana y aire acondicionado. Somos tu mejor aliado para el descanso y la tranquilidad.","Nuestras lineas de atención son: 3159871228","El aeropuerto (Aeropuerto de Riohacha) está a 20.4 km.",2,R.drawable.hotel5)));
    }
}