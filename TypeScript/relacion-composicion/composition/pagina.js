var Page = /** @class */ (function () {
    function Page(content, numberPage) {
        this.content = content;
        this.numberPage = numberPage;
    }
    Page.prototype.getContent = function () {
        return this.content;
    };
    Page.prototype.setContent = function (newContent) {
        this.content = newContent;
    };
    Page.prototype.getNumberPage = function () {
        return this.numberPage;
    };
    return Page;
}());
