_.templateSettings.interpolate = /\{\{=([^-][\S\s]+?)\}\}/g;
_.templateSettings.evaluate = /\{\{([^-=][\S\s]+?)\}\}/g;
_.templateSettings.escape = /\{\{-([^=][\S\s]+?)\}\}/g;

var _sync = Backbone.sync;
Backbone.sync = function(method, model, options) {
    options.beforeSend = function(xhr) {
        xhr.setRequestHeader('Content-Type', 'application/json');
    };
    _sync.apply(Backbone, arguments);
}

var bodyElement = $("#content");
var tableBodyElement = bodyElement.find('.table-body');
var tableBodyScrollElement = bodyElement.find('.table-body-scroll');

function initTableBodyScroll(bodyElement, tableBodyElement, tableBodyScrollElement){
    var selectScroll = '';

    tableBodyScrollElement.on("mousedown", function(e){
        selectScroll = 'table-body-scroll';
    });

    tableBodyScrollElement.on("scroll", function(e){
        if(selectScroll == 'table-body-scroll'){
            $(this).siblings('.body').find('.table-body').scrollTop($(this).scrollTop());
        }
    });

    tableBodyElement.on('mousewheel', function(e){
        selectScroll = 'table-body';
    });

    tableBodyElement.on("scroll", function(e){
        if(selectScroll == 'table-body'){
            $(this).closest('.body').siblings('.table-body-scroll').scrollTop($(this).scrollTop());
        }
    });

    tableBodyElement.each(function() {
        var tableBodyHeight = $(this).outerHeight();
        var tableBodyPaddingTop = ~~$(this).css('padding-top').replace(/[^-\d\.]/g, '');
        var tableBodyPaddingBottom = ~~$(this).css('padding-bottom').replace(/[^-\d\.]/g, '');
        var tableHeight = ~~$(this).find('.table').outerHeight();
        var tableBodySize = tableBodyPaddingTop + tableBodyPaddingBottom + tableHeight;
        $(this).closest('.body').siblings('.table-body-scroll').height(tableBodyHeight).find('.table-body-size').height(tableBodySize);
    });

    $(window).on('resize', function () {
        tableBodyElement.each(function() {
            var tableBodyHeight = $(this).outerHeight();
            var tableBodyPaddingTop = ~~$(this).css('padding-top').replace(/[^-\d\.]/g, '');
            var tableBodyPaddingBottom = ~~$(this).css('padding-bottom').replace(/[^-\d\.]/g, '');
            var tableHeight = ~~$(this).find('.table').outerHeight();
            var tableBodySize = tableBodyPaddingTop + tableBodyPaddingBottom + tableHeight;
            $(this).closest('.body').siblings('.table-body-scroll').height(tableBodyHeight).find('.table-body-size').height(tableBodySize);
        });
    });
}

initTableBodyScroll(bodyElement, tableBodyElement, tableBodyScrollElement);