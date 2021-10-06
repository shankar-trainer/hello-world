export class Mobile {
    mobileId: number;
    mobileName: string;
    mobileCost: number;

    constructor(mobileId: number,
        mobileName: string,
        mobileCost: number) {
        this.mobileId = mobileId;
        this.mobileName = mobileName;
        this.mobileCost = mobileCost;
    }
    public printMobileDetail() {
        console.log('mobile Id ' + this.mobileId);
        console.log('mobile Name ' + this.mobileName);
        console.log('mobile Cost ' + this.mobileCost);
    }
}