package com.example.vechile.Vechilecontroller;

import com.example.vechile.vechilemodule.Vechile;
import com.example.vechile.vechileservice.IvechileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VechileController {
    @Autowired
    IvechileService ivechileService;
    @GetMapping("/getVechilemode/{mode}")
    public Vechile getVechilemode(@PathVariable String mode){
        return ivechileService.getVechilemode(mode);
    }
    @GetMapping("/getvechilebrands/{mode2}")
    public Vechile getvechilebrands(@PathVariable String mode2){

        return ivechileService.getvechilebrands(mode2);
       // @GetMapping
               // public Vechile getvechilecolour(@PathVariable String mode2)
    }
   // @GetMapping("/getvechilecolour/{mode3}")
    //public Vechile getvechilecolour(@PathVariable String mode3){
       // return ivechileService.getvechilecolour(mode3);
    }


