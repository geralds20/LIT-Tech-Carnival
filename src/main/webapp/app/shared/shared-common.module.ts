import { NgModule } from '@angular/core';

import { LitTechCarnivalSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [LitTechCarnivalSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [LitTechCarnivalSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class LitTechCarnivalSharedCommonModule {}
