import {Mobile} from './Mobile';

export class BasicPhone extends Mobile{
 mobileType:string;

 constructor(mobileId: number,
    mobileName: string,
     mobileCost: number, mobileType:string){
        super(mobileId,mobileName,mobileCost);
        this.mobileType=mobileType;
    }

}