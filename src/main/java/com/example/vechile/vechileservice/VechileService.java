package com.example.vechile.vechileservice;

import com.example.vechile.vechilemodule.Vechile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class VechileService implements IvechileService{


    @Override
    public Vechile getVechilemode(String mode) {
        HashMap<String,Vechile> vechilemodes=new HashMap<>();
        Vechile v1=new Vechile();
        v1.setVechilemode("twowheeler");
        Vechile v2=new Vechile();
        v2.setVechilemode("fourwheeler");
        vechilemodes.put(v1.getVechilemode(), v1);
        vechilemodes.put(v2.getVechilemode(), v2);
        return vechilemodes.get(mode);


    }

    @Override
    public Vechile getvechilebrands(String mode2) {
        HashMap<String, Vechile> vechilebrands = new HashMap<>();
        //List<String> Brands=new ArrayList<>();
        Vechile v3 = getVechilemode(mode2);
        if (v3.getVechilemode().equalsIgnoreCase("twowheeler")) {
            v3.setVechilebrand("yahama");
            v3.setVechilecolour("blue");
            v3.setVechilepower("155CC");
            vechilebrands.put(v3.getVechilemode(), v3);
            vechilebrands.put(v3.getVechilecolour(),v3);
            vechilebrands.put(v3.getVechilepower(),v3);

        }else if (v3.getVechilemode().equalsIgnoreCase("fourwheeler")){


            v3.setVechilebrand("maruthi");
            v3.setVechilecolour("white");
            v3.setVechilepower("1000CC");
            vechilebrands.put(v3.getVechilemode(), v3);
            vechilebrands.put(v3.getVechilecolour(),v3);
            vechilebrands.put(v3.getVechilepower(),v3);

        }





        return vechilebrands.get(mode2);
    }


    }

