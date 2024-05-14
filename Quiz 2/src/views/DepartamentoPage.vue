<template>
    <ion-page>
      <ion-header :translucent="true">
        <ion-toolbar>
          <ion-title>Departamento</ion-title>
        </ion-toolbar>
      </ion-header>  
      <ion-content>       
        <div id="login-container">  
          <div id="login-form">
            <ConcatComponent />

          </div>
  
          <div> 
             <!--Traer el componente de los botones de la crud  -->
            <CrudButtonComponent />
          </div>         
        </div>
      </ion-content>
    </ion-page>
  </template>
  
  <script setup lang="ts">
  import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
  import ButtonComponent from '@/components/ButtonComponent.vue';
  import InputComponent from '@/components/InputComponent.vue';
  import CrudButtonComponent from '@/components/CrudButtonComponent.vue';
  import ConcatComponent from '@/components/ConcatComponent.vue';
  </script>
  
  <style scoped src="../theme/container.css"></style>