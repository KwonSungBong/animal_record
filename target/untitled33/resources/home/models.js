var app = app || {};

app.AnimalRecord = Backbone.Model.extend({
    defaults:{
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: ''
    },
    idAttribute: 'idx'
});

app.AnimalRecords = Backbone.PageableCollection.extend({
    model: app.AnimalRecord,
    url: contextPath + "/archive/animalRecords",
    state: {
        firstPage: 0,
        currentPage: 0,
        pageSize: 20,
        sortKey:"idx,DESC",
        order: 0
    },
    queryParams: {
        currentPage: "page",
        pageSize: "size",
        sortKey: "sort"
    }
});

app.AdditionRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        description: '',
        startDate: '',
        endDate: '',
        additionRecordStatus: '',
        additionRecordType: '',
        additionRecordCategory: ''
    },
    idAttribute: 'idx'
});

app.MammaliaRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        weight: ''
    },
    idAttribute: 'idx'
});

app.AmphibianRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        habitat: ''
    },
    idAttribute: 'idx'
});

app.BirdRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        sense: '',
        wingspan: '',
        beakLength: ''
    },
    idAttribute: 'idx'
});

app.InsectRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        feeler: '',
        prothorax: '',
        mesothorax: '',
        metathorax: ''
    },
    idAttribute: 'idx'
});

app.ArachnidRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        pedipalpLength: '',
        firstLegLength: '',
        secondLegLength: '',
        thirdLegLength: '',
        forthLegLength: ''
    },
    idAttribute: 'idx'
});

app.ReptiliaRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        fear: '',
        feature: '',
        tailLength: ''
    },
    idAttribute: 'idx'
});

app.FishRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        fin: '',
        gill: ''
    },
    idAttribute: 'idx'
});

app.InvertebrateRecord = Backbone.Model.extend({
    defaults: {
        idx: null,
        regDate: '',
        modDate: '',
        name: '',
        kind: '',
        description: '',
        genderType: '',
        birthday: '',
        spineNumber: ''
    },
    idAttribute: 'idx'
});
