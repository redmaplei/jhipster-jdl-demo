import { IBook } from 'app/shared/model//book.model';

export interface IAuthor {
    id?: number;
    writerName?: string;
    writerBook?: string;
    books?: IBook[];
}

export class Author implements IAuthor {
    constructor(public id?: number, public writerName?: string, public writerBook?: string, public books?: IBook[]) {}
}
