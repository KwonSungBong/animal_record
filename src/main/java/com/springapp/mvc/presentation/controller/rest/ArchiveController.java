package com.springapp.mvc.presentation.controller.rest;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.search.AnimalRecordSearchCondition;
import com.springapp.mvc.business.service.AdditionRecordService;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import com.springapp.mvc.business.service.AnimalRecordService;
import com.springapp.mvc.presentation.validator.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/archive")
public class ArchiveController {

    @Autowired
    private AnimalRecordService animalRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService mammaliaRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService amphibianRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService birdRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService insectRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService arachnidRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService reptiliaRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService fishRecordServiceImpl;

    @Autowired
    private AnimalRecordByTypeService invertebrateRecordServiceImpl;

    @Autowired
    private AdditionRecordService additionRecordServiceImpl;

    @Autowired
    private MammaliaRecordValidator mammaliaRecordValidator;

    @Autowired
    private AmphibianRecordValidator amphibianRecordValidator;

    @Autowired
    private BirdRecordValidator birdRecordValidator;

    @Autowired
    private InsectRecordValidator insectRecordValidator;

    @Autowired
    private ArachnidRecordValidator arachnidRecordValidator;

    @Autowired
    private ReptiliaRecordValidator reptiliaRecordValidator;

    @Autowired
    private FishRecordValidator fishRecordValidator;

    @Autowired
    private InvertebrateRecordValidator invertebrateRecordValidator;

    @Autowired
    private AdditionRecordValidator additionRecordValidator;

    @InitBinder("animalRecord")
    public void initMammaliaRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(mammaliaRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initAmphibianRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(amphibianRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initBirdRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(birdRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initInsectRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(insectRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initArachnidRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(arachnidRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initReptiliaRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(reptiliaRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initFishRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(fishRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initInvertebrateRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(invertebrateRecordValidator);
    }
    @InitBinder("animalRecord")
    public void initAdditionRecordBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(additionRecordValidator);
    }

    @RequestMapping(value = "/animalRecords", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public ResponseEntity getAnimalRecords(
            @ModelAttribute("animalRecordSearchCondition") AnimalRecordSearchCondition animalRecordSearchCondition
            ,Pageable pageable) {
        return new ResponseEntity(animalRecordServiceImpl.getAnimalRecords(animalRecordSearchCondition,pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public ResponseEntity getAnimalRecords(
            @ModelAttribute("animalRecordSearchCondition") AnimalRecordSearchCondition animalRecordSearchCondition,
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            Pageable pageable) {
        return new ResponseEntity(animalRecordServiceImpl.getAnimalRecords(animalRecordSearchCondition,animalRecordType,pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}/{animalRecordIdx}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public ResponseEntity getAnimalRecords(
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        return new ResponseEntity(animalRecordServiceImpl.getAnimalRecord(animalRecordType, animalRecordIdx), HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}/{animalRecordIdx}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
    public ResponseEntity deleteAnimalRecords(
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        animalRecordServiceImpl.deleteAnimalRecord(animalRecordType,animalRecordIdx);
        return new ResponseEntity(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.MAMMALIA_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid MammaliaRecord animalRecord) {
        mammaliaRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.AMPHIBIAN_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid AmphibianRecord animalRecord) {
        amphibianRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.BIRD_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid BirdRecord animalRecord) {
        birdRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.INSECT_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid InsectRecord animalRecord) {
        insectRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.ARACHNID_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid ArachnidRecord animalRecord) {
        arachnidRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.REPTILIA_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid ReptiliaRecord animalRecord) {
        reptiliaRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.FISH_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid FishRecord animalRecord) {
        fishRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.INVERTEBRATE_RECORD_TYPE, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(@RequestBody @Valid InvertebrateRecord animalRecord) {
        invertebrateRecordServiceImpl.saveAnimalRecord(animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.MAMMALIA_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid MammaliaRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        mammaliaRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.AMPHIBIAN_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid AmphibianRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        amphibianRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.BIRD_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid BirdRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        birdRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.INSECT_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid InsectRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        insectRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.ARACHNID_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid ArachnidRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        arachnidRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.REPTILIA_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid ReptiliaRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        reptiliaRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.FISH_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid FishRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        fishRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }
    @RequestMapping(value = "/animalRecords/"+AnimalRecordTypeEnum.INVERTEBRATE_RECORD_TYPE+"/{animalRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid InvertebrateRecord animalRecord,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        invertebrateRecordServiceImpl.updateAnimalRecord(animalRecordIdx, animalRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}/{animalRecordIdx}/additionRecords", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public ResponseEntity getAdditionRecords(
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            @PathVariable("animalRecordIdx") int animalRecordIdx,
            Pageable pageable) {
        return new ResponseEntity(additionRecordServiceImpl.getAdditionRecords(animalRecordType, animalRecordIdx, pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}/{animalRecordIdx}/additionRecords/{additionRecordIdx}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public ResponseEntity getAdditionRecords(
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            @PathVariable("animalRecordIdx") int animalRecordIdx,
            @PathVariable("additionRecordIdx") int additionRecordIdx) {
        return new ResponseEntity(additionRecordServiceImpl.getAdditionRecord(animalRecordType,animalRecordIdx,additionRecordIdx), HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}/{animalRecordIdx}/additionRecords", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity postBaseRecords(
            @RequestBody @Valid AdditionRecord additionRecord,
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            @PathVariable("animalRecordIdx") int animalRecordIdx) {
        additionRecordServiceImpl.saveAdditionRecord(animalRecordType,animalRecordIdx,additionRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}/{animalRecordIdx}/additionRecords/{additionRecordIdx}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity putBaseRecords(
            @RequestBody @Valid AdditionRecord additionRecord,
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            @PathVariable("animalRecordIdx") int animalRecordIdx,
            @PathVariable("additionRecordIdx") int additionRecordIdx) {
        additionRecordServiceImpl.updateAdditionRecord(animalRecordType,animalRecordIdx,additionRecordIdx,additionRecord);
        return new ResponseEntity(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/animalRecords/{animalRecordType}/{animalRecordIdx}/additionRecords/{additionRecordIdx}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
    public ResponseEntity deleteAdditionRecords(
            @PathVariable("animalRecordType") AnimalRecordTypeEnum animalRecordType,
            @PathVariable("animalRecordIdx") int animalRecordIdx,
            @PathVariable("additionRecordIdx") int additionRecordIdx) {
        additionRecordServiceImpl.deleteAdditionRecord(animalRecordType,animalRecordIdx,additionRecordIdx);
        return new ResponseEntity(true, HttpStatus.OK);
    }
}
