package novi.backend.backendspringbootcontrollertechiteasy.controllers;

import novi.backend.backendspringbootcontrollertechiteasy.models.Television;
import novi.backend.backendspringbootcontrollertechiteasy.exceptions.RecordNotFoundException;
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
public ResponseEntity<Television> getTelevisionById(@PathVariable Long id){
    if (id >= 0 && id < televisions.size()) {
        return ResponseEntity.ok(televisions.get(Math.toIntExact(id)));
    } else {
        throw new RecordNotFoundException("Television with id " + id + " not found");
    }
}

@PutMapping("/{id}")
public ResponseEntity<Television> updateTelevision(@PathVariable Long id, Television television) {
    if (id >= 0 && id < televisions.size()) {
        televisions.set(Math.toIntExact(id), television);
        return ResponseEntity.ok(television);
    } else {
       throw new RecordNotFoundException("Television with id " + id + " not found");
    }
}

@PostMapping
    public ResponseEntity<Television> addTelevision(Television television) {
    televisions.add(television);
    return ResponseEntity.created(null).body(television);
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable Long id) {
        if (id >= 0 && id < televisions.size()) {
            televisions.remove(id);
            return ResponseEntity.noContent().build();
        } else {
           throw new RecordNotFoundException("Television with id " + id + " not found");
        }
    }

}
