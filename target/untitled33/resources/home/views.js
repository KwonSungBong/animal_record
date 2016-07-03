var app = app || {};

app.AnimalRecordView = Backbone.View.extend({
    tagName: 'tr',
    className: 'animal_record',
    template: _.template($('#animal_record_template').html()),
    events: {
    },
    initialize: function(){

    },
    render: function(){
        this.$el.html(this.template(this.model.toJSON()));
        return this;
    }
});

app.AnimalRecordsView = Backbone.View.extend({
    el:'#animal_records',
    emptyTemplate: _.template($('#animal_record_empty_template').html()),
    events:{
        'scroll': 'morePage'
    },
    initialize: function(){
        this.animalRecords = new app.AnimalRecords();
        this.animalRecords.bind('sync', this.render, this);
    },
    search: function(name){
        this.$el.empty();
        this.animalRecords.getFirstPage({data:{name:name}});
    },
    render: function(){
        if(this.animalRecords.length == 0){
            this.$el.html(this.emptyTemplate());
        } else {
            this.animalRecords.each(function(item){
                this.renderAnimalRecord(item);
            }, this);
        }

        $( window ).trigger('resize');
    },
    renderAnimalRecord: function(item){
        var animalRecordView = new app.AnimalRecordView({
            model:item
        });
        this.$el.append(animalRecordView.render().el);
    },
    morePage: function(){
        this.animalRecords.getNextPage();
    }
});

app.AnimalDetailRecordSelectView = Backbone.View.extend({
    el:'#animal_detail_record',
    animalDetailRecordSelectTemplate: _.template($('#animal_detail_record_select_template').html()),
    animalDetailRecordWriteFormTemplate: _.template($('#animal_detail_record_select_template').html()),
    events:{

    },
    initialize: function(){

    },
    select: function(){
        this.$el.html(this.animalDetailRecordSelectTemplate());
        this.$('#animal_record_type_enum').on('click', '.animal_record_type', function(){
            this.render();
        }.bind(this));
        return this;
    },
    render: function(){
        alert("ASF");
        //this.$el.html(this.animalDetailRecordWriteFormTemplate());
        return this;
    }
});

app.MammaliaDetailRecordView = Backbone.View.extend({
    el:'#animal_detail_record',
    animalDetailRecordWriteFormTemplate: _.template($('#mammalia_detail_record_write_form_template').html()),
    animalDetailRecordReadFormTemplate: _.template($('#mammalia_detail_record_read_form_template').html()),
    events:{

    },
    initialize: function(){

    },
    createPostRender: function(){
        //this.model = new Post();
        //this.$el.html(this.animalDetailRecordWriteFormTemplate(this.model.toJSON()));
        //return this;
    },
    search: function(item){
        this.model = item;
        this.render();
    },
    render: function(){
        //this.$el.html(this.template(this.model.toJSON()));
        return this;
    }
});

app.WrapperView = Backbone.View.extend({
    el:'#wrapper',
    events:{
        'click #search': 'search',
        'click #save_animal_detail_record': 'saveAnimalDetailRecord',
        'click #update_animal_detail_record': 'updateAnimalDetailRecord',
        'click #create_animal_detail_record': 'createAnimalDetailRecord',
        'click #destroy_animal_detail_record': 'destroyAnimalDetailRecord'
    },
    initialize: function(){
        this.animalDetailRecordSelectView = new app.AnimalDetailRecordSelectView();
        this.animalRecordsView = new app.AnimalRecordsView();
        this.$searchName = this.$('#search_name');
    },
    render: function(){

    },
    search: function(){
        var searchName = this.$searchName.val();
        this.animalRecordsView.search(searchName);
    },
    saveAnimalDetailRecord: function(){

    },
    updateAnimalDetailRecord: function(){

    },
    createAnimalDetailRecord: function(){
        this.animalDetailRecordSelectView.select();
    },
    destroyAnimalDetailRecord: function(){

    }
});
