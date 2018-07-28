import { IAuthor } from 'app/shared/model//author.model';

export interface IBook {
    id?: number;
    bookName?: string;
    writerName?: string;
    writer?: IAuthor;
}

export class Book implements IBook {
    constructor(public id?: number, public bookName?: string, public writerName?: string, public writer?: IAuthor) {}
}
