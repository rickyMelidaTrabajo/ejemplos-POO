export class Page {
	
    private content: string;
    private numberPage: number;

    constructor(content: string, numberPage) {
        this.content = content;
        this.numberPage = numberPage;
    }

    getContent():string {
        return this.content;
    }

    setContent(newContent: string) {
        this.content = newContent;
    }

    getNumber(): number {
        return this.numberPage;
    }

    setNumber(newNumber: number) {
    	this.numberPage = newNumber;
    }
}
