import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { JdLdemoBookModule } from './book/book.module';
import { JdLdemoAuthorModule } from './author/author.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    // prettier-ignore
    imports: [
        JdLdemoBookModule,
        JdLdemoAuthorModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JdLdemoEntityModule {}
