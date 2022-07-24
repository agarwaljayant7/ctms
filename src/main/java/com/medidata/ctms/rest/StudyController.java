package com.medidata.ctms.rest;

import com.medidata.ctms.model.Study;
import com.medidata.ctms.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudyController {
    @Autowired
    private StudyRepository studyRepository;

    @PostMapping("/studies")
    public Study createStudy(@Valid @RequestBody Study study){
        return studyRepository.save(study);
    }

    @GetMapping("/studies")
    public List<Study> getStudies(){

        return studyRepository.findAll();
    }

}
