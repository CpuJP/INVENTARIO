package microservicios.demo.controller;


import microservicios.demo.entity.MicroEntity;
import microservicios.demo.repository.MicroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/micro")
public class MicroController {
    @Autowired
    private MicroRepositorio microRepositorio;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<MicroEntity> getAllMicro(){
        return microRepositorio.findAll();
    }


    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.OK)
    public void createMicro(@RequestBody MicroEntity microEntity){
        microRepositorio.save(microEntity);

    }
}
