import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { AuthService } from '../auth';

@Component({
  selector: 'app-auth',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './auth.html',
  styleUrl: './auth.css',
})
export class Auth {
    signInForm = new FormGroup({
        email: new FormControl<string>('', [Validators.required]),
    });

    constructor(private authService: AuthService) { }

    signIn() {
        if (this.signInForm.valid) {
            this.authService.signIn(this.signInForm.value.email as string);
        }
    }

}
