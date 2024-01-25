import axios from 'axios';


const url='http://localhost:8080/customer/'

export default class CustomerService{
    getAllCustomer(){
        //return axios.get('http://localhost:8080/customer/all');
        return axios.get(url+'all');
    }
    
    getCustomerById(id){
        return axios.get(url+'search/'+id);
    }

}