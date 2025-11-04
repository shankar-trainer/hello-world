import { ComponentFixture, TestBed } from '@angular/core/testing';
import { RegisterComponent } from './register.component';
import { AuthService } from '../../services/auth.service';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';

describe('RegisterComponent', () => {
  let component: RegisterComponent;
  let fixture: ComponentFixture<RegisterComponent>;
  let authServiceSpy: jasmine.SpyObj<AuthService>;
  let routerSpy: jasmine.SpyObj<Router>;

  beforeEach(async () => {
    const authSpy = jasmine.createSpyObj('AuthService', ['register']);
    const routeSpy = jasmine.createSpyObj('Router', ['navigate']);

    await TestBed.configureTestingModule({
      imports: [RegisterComponent], // standalone
      providers: [
        { provide: AuthService, useValue: authSpy },
        { provide: Router, useValue: routeSpy }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(RegisterComponent);
    component = fixture.componentInstance;
    authServiceSpy = TestBed.inject(AuthService) as jasmine.SpyObj<AuthService>;
    routerSpy = TestBed.inject(Router) as jasmine.SpyObj<Router>;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should set error if passwords do not match', () => {
    component.registerData.password = '123';
    component.registerData.confirmPassword = '456';

    component.register();

    expect(component.registerError).toBe('As senhas não conferem');
    expect(authServiceSpy.register).not.toHaveBeenCalled();
  });

  it('should call authService.register with username and password only', () => {
    component.registerData = {
      fullname: 'Matheus',
      username: 'matheus123',
      email: 'matheus@email.com',
      password: '123456',
      confirmPassword: '123456'
    };

    authServiceSpy.register.and.returnValue(of({}));

    component.register();

    expect(authServiceSpy.register).toHaveBeenCalledWith({
      username: 'matheus123',
      password: '123456'
    });
  });

  it('should navigate to /login after successful register', () => {
    component.registerData = {
      fullname: 'Matheus',
      username: 'matheus123',
      email: 'matheus@email.com',
      password: '123456',
      confirmPassword: '123456'
    };

    authServiceSpy.register.and.returnValue(of({}));

    component.register();

    expect(routerSpy.navigate).toHaveBeenCalledWith(['/login']);
  });

  it('should set error message on register failure', () => {
    component.registerData = {
      fullname: 'Matheus',
      username: 'matheus123',
      email: 'matheus@email.com',
      password: '123456',
      confirmPassword: '123456'
    };

    authServiceSpy.register.and.returnValue(throwError(() => new Error('Falha no registro')));

    component.register();

    expect(component.registerError).toBe('Erro ao registrar: Falha no registro');
  });
});
