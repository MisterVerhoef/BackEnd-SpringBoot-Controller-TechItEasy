package novi.backend.backendspringbootcontrollertechiteasy.controllers;

import novi.backend.backendspringbootcontrollertechiteasy.Television;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/televisions")
@RestController
public class TelevisionsController {

    private ArrayList<Television> televisions = new ArrayList<>();

@GetMapping
    public ResponseEntity<List<Television>> getTelevisions() {
    return ResponseEntity.ok(televisions);
}

@GetMapping("/{id}")
public ResponseEntity<Television> getTelevisionById(@PathVariable int id){
    if (id >= 0 && id < televisions.size()) {
        return ResponseEntity.ok(televisions.get(id));
    } else {
        return ResponseEntity.notFound().build();
    }
}

@PostMapping
    public ResponseEntity<Television> addTelevision(Television television) {
    televisions.add(television);
    return ResponseEntity.created(null).body(television);
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id) {
        if (id >= 0 && id < televisions.size()) {
            televisions.remove(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
